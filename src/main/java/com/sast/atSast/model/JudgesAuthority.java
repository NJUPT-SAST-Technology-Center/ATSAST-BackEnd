package com.sast.atSast.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JudgesAuthority {
    private long contestId;
    private long judgeUid;
    private boolean enable;
    private long id;
}
