package com.sast.atSast.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private long uid;
    private String email;
    private String password;
    private Byte type;
    private String salt;
    private Byte enable;

    public Account(String email, String password, Byte type, String salt) {
        this.email = email;
        this.password = password;
        this.type = type;
        this.salt = salt;
    }
}
