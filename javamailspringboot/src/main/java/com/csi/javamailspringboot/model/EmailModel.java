package com.csi.javamailspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel {

    private String toEamil[];

    private String ccEmail[];

    private String emailSubject;

    private String emailBody;


    private String emailAttachment;
}
