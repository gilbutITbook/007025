/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.avoid_unneccessary_comparisons.problem;

import general.Result;
import general.Microscope;
import general.Sample;

class Laboratory {

    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isInorganic(sample) == true) {
            return Result.INORGANIC;
        } else {
            return analyzeOrganic(sample);
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (microscope.isHumanoid(sample) == false) {
            return Result.ALIEN;
        } else {
            return Result.HUMANOID;
        }
    }
}
