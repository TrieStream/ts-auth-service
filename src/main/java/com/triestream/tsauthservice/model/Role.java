package com.triestream.tsauthservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    public final static Role USER = new Role("USER");
    public final static Role ADMIN = new Role("ADMIN");
    public final static Role SERVICE = new Role("SERVICE");

    private String name;
}
