package com.webSERIE.movie.Model.entity.DTO;


import com.webSERIE.movie.Model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int userid;
    private String username;
    private String email;
    private String password;
    public static UserDto tDto(User user){
        return UserDto.builder()
                .userid(user.getUserid())
                .username(user.getUsername())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }
}
