package com.jwt.JWT.Implementation.enities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    private int userId;
    private String userName;
    private String userRole;
}
