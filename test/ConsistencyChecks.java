/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ConsistencyChecks {

    private static final int LINE_LENGTH_MAX = 85;
    private final Path itemPath;

    public ConsistencyChecks(Object paths) {
        this.itemPath = (Path) paths;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> data() throws IOException {
        return Files.list(Paths.get("src")).flatMap(chapterPath -> {
            try {
                return Files.list(chapterPath).filter(Files::isDirectory);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
    }

    @Test
    public void checkConsistency() throws IOException {
        assertProblem(itemPath);
        assertSolution(itemPath);
    }

    private void assertProblem(Path packagePath) throws IOException {
        final Path path = packagePath.resolve("problem");
        assertDirectory(path);
        assertConsistency(path);
        if (!isIgnoredPackage(packagePath.getParent())) {
            assertNoVisibilityModifiers(path);
        }
    }

    private boolean isIgnoredPackage(Path packagePath) {
        String packageName = packagePath.getFileName().toString();
        return packageName.equals("preface");
    }

    private void assertSolution(Path packagePath) throws IOException {
        final Path path = packagePath.resolve("solution");
        assertDirectory(path);
        assertConsistency(path);
        if (!isIgnoredPackage(packagePath.getParent())) {
            assertNoVisibilityModifiers(path);
        }
    }

    private void assertConsistency(Path problemPath) throws IOException {
        Files.list(problemPath).filter(Files::isRegularFile).forEach(p -> {
            try {
                final List<String> lines = Files.readAllLines(p);

                assertClassTags(p, lines);
                assertHighlightTags(p, lines);
                assertLineLength(p, lines);
                assertNoStaticImports(p, lines);
                assertNoStaticFinal(p, lines);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        });
    }

    private void assertClassTags(Path p, List<String> lines) {
        final boolean hasPart = lines.stream().anyMatch(line -> line.endsWith("
                && lines.stream().anyMatch(line -> line.endsWith("
        if (!hasPart) {
            throw new IllegalStateException(p + " is missing a START:class/END:class tag pair");
        }
    }

    private void assertHighlightTags(Path p, List<String> lines) {
        if (!hasHighlight) {
        }
    }

    private void assertLineLength(Path p, List<String> lines) {
        for (int i = 0, linesSize = lines.size(); i < linesSize; i++) {
            String line = lines.get(i);

            final boolean skipIfImport = line.startsWith("import");
            if (skipIfImport) {
                continue;
            }

            final int lineLength = expandTabsToEightChars(removeLineComment(line)).length();
            if (lineLength > LINE_LENGTH_MAX) {
                final int lineNumber = i + 1;
                throw new IllegalStateException(p + " line " + lineNumber + " is too long (" + lineLength + " instead of " + LINE_LENGTH_MAX + " characters)");
            }
        }
    }

    private void assertNoStaticImports(Path p, List<String> lines) throws IOException {
        final boolean hasStaticImport = lines.stream().anyMatch(line -> line.trim().contains("import static"));
        if (hasStaticImport) {
            throw new IllegalStateException(p + " has a file with static imports!");
        }
    }

    private void assertNoStaticFinal(Path p, List<String> lines) throws IOException {
        final boolean hasStaticFinal = lines.stream().anyMatch(line -> line.trim().contains("final static"));
        if (hasStaticFinal) {
            throw new IllegalStateException(p + " has 'final static' instead of 'static final'!");
        }
    }

    private static String removeLineComment(String line) {
        return line.replaceAll("//.*", "");
    }

    private static String expandTabsToEightChars(String line) {
        return line.replaceAll("\t", "abcdefgh");
    }

    // 78
    // tabs count 8

    private void assertNoVisibilityModifiers(Path problemPath) throws IOException {
        if (!Files.list(problemPath).filter(Files::isRegularFile).allMatch(p -> {
            try {
                List<String> lines = Files.readAllLines(p);

                boolean allowModifierInNextLine = false;
                for (String line : lines) {
                    if (allowModifierInNextLine) {
                        allowModifierInNextLine = false;
                        continue;
                    }
                    if (line.contains("@Override")) {
                        allowModifierInNextLine = true;
                        continue;
                    }
                    if (line.contains("public ") || line.contains("protected ")) {
                        return false;
                    }
                }
                return true;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        })) {
            throw new IllegalStateException(problemPath + " has a file with visibility modifiers");
        }
    }

    private void assertDirectory(Path directoryPath) {
        if (!Files.isDirectory(directoryPath)) {
            throw new IllegalStateException(directoryPath + " is required");
        }
    }
}
