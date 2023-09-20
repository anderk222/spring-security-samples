/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Anderson Macias
 * Created: Sep 20, 2023
 */

-- User user/pass

INSERT INTO users (user_name, email,password)
  values ('user',
    'anderk222@gmail.com',    
    '$2a$10$8.UnVuG9HHgffUDAlk8qfOuVGkqRzgVymGe07xd00DMxs.AQubh4a'
 );

INSERT INTO authorities (name) VALUES('USER');
INSERT INTO authorities (name) VALUES('ADMIN');

INSERT INTO user_authorities (user_id, authority_id)
  values (
     (SELECT users.id  FROM users WHERE user_name='user'), 
     (SELECT authorities.id from authorities WHERE name='USER')
);
