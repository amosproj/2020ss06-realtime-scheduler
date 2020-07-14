package com.honeybadgers.postgre.repository;


import com.honeybadgers.models.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<Group, String> {

    /*@Query(value = "SELECT *, ARRAY(SELECT id FROM public.\"group\" WHERE parent_id=?1) as childs FROM public.\"group\" WHERE id=?1", nativeQuery = true)
    Optional<GROUP EXTENSION> findByIdWithChildrenList(String groupId);*/

    /**
     * Deletes the group with the given id
     * @param id id of group wanted to be deleted
     * @return Optional of deleted group or empty Optional if task with id not found
     */
    @Query(value = "DELETE FROM public.\"group\" WHERE id=?1 RETURNING *", nativeQuery = true)
    Optional<Group> deleteByIdCustomQuery(String id);

    /**
     * Splits the table into variable sized pages and returns one.
     * @param size Number of Objects per page.
     * @param offset Page number.
     * @return Page of groups as List.
     */
    @Query(value = "SELECT * FROM public.\"group\" LIMIT ?1 OFFSET ?2", nativeQuery = true)
    List<Group> getAllGroupsByPage(int size, int offset);

    /**
     * Returns a List of all groups with the same parent group.
     * @param parentId id of specified parent group.
     * @return List of child groups.
     */
    @Query(value = "SELECT * FROM public.\"group\" WHERE parent_id=?1", nativeQuery = true)
    List<Group> findAllByParentGroupId(String parentId);

    /**
     * Increments current_parallelism_degree value by 1 and returns updated object
     * @param groupId id of group to be updated
     * @return Group object after update
     */
    @Query(value = "UPDATE public.\"group\" SET current_parallelism_degree = current_parallelism_degree + 1 WHERE id = ?1 RETURNING *", nativeQuery = true)
    Group incrementCurrentParallelismDegree(String groupId);

    /**
     * Decrements current_parallelism_degree value by 1 and returns updated object
     * ONLY if group was found AND the current_parallelism_degree will not get negative (check through where clause)
     * @param groupId id of group to be updated
     * @return Optional of Group object, which is empty, if: group not found OR group.current_parallelism_degree == 0
     */
    @Query(value = "UPDATE public.\"group\" SET current_parallelism_degree = current_parallelism_degree - 1 WHERE id = ?1 AND current_parallelism_degree > 0 RETURNING *", nativeQuery = true)
    Optional<Group> decrementCurrentParallelismDegree(String groupId);
}
