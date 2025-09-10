package com.pixel.marcobehler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Potus {
    private String firstName;
    private String lastName;
    private int electionYear;
    private String party;

    private List<Wife> wives;

    public Potus(String firstName, String lastName, int electionYear, String party) {
        this(firstName, lastName, electionYear, party, Collections.emptyList());
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Potus(firstName=").append(firstName)
                .append(", lastName=").append(lastName)
                .append(", electionYear=").append(electionYear)
                .append(", party=").append(party);

        if (wives != null && !wives.isEmpty()) {
            sb.append(", wives=").append(wives);
        }

        sb.append(")");
        return sb.toString();
    }
}

