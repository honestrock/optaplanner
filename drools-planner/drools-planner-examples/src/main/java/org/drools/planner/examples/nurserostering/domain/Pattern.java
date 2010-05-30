package org.drools.planner.examples.nurserostering.domain;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.drools.planner.examples.common.domain.AbstractPersistable;

/**
 * @author Geoffrey De Smet
 */
@XStreamAlias("Pattern")
public class Pattern extends AbstractPersistable implements Comparable<Pattern> {

    private String code;

    private List<PatternEntry> patternEntryList;

    private int weight;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<PatternEntry> getPatternEntryList() {
        return patternEntryList;
    }

    public void setPatternEntryList(List<PatternEntry> patternEntryList) {
        this.patternEntryList = patternEntryList;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int compareTo(Pattern other) {
        return new CompareToBuilder()
                .append(id, other.id)
                .toComparison();
    }

    @Override
    public String toString() {
        return code + " " + patternEntryList;
    }

    public int getPatternEntrySize() {
        return patternEntryList.size();
    }

}
