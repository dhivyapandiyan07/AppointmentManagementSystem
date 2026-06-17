
package com.appointment.entity;
import jakarta.persistence.*; import lombok.*;
@Entity @Data public class Patient{
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
String name; String email;
}
