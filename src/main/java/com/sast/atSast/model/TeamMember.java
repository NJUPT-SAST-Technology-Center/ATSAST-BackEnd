package com.sast.atSast.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamMember {
    private Long teamId;
    private Long memberUid;
    private Byte enable;
    private Long leaderUid;
    private String instructor;
    private String instructorId;
    private Long contestId;
    private String teamName;
    private Integer score;
    private String result;
    private String teamGroup;
    private String subjectCategory;
}
