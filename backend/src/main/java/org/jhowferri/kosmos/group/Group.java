package org.jhowferri.kosmos.group;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;
import java.util.List;

@Node
@Data
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue
    Long id;

    String name;
    String description;

    @Relationship(type="PARENT_OF", direction = Relationship.Direction.INCOMING)
    Group parent;

    @Relationship(type="PARENT_OF", direction = Relationship.Direction.OUTGOING)
    List<Group> children = new ArrayList<>();

}
