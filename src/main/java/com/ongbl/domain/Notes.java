package com.ongbl.domain;

import lombok.*;
import javax.persistence.*;

/**
 * @created: 4/11/2022
 * @author: boonloong
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
