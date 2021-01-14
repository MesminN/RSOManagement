package com.rso.multilayered.dao.interfaces;

import org.jetbrains.annotations.NotNull;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public abstract class EntityDAO<T> {

    protected EntityManager entityManager;
    protected T entity;


    public Optional<T> find(long key) {
        return (Optional<T>) Optional.ofNullable(this.getEntityManager().find(this.getEntity().getClass(), key));
    }

    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = this.getCriteriaQuery();
        Root<T> root = (Root<T>) criteriaQuery.from(this.getEntity().getClass());
        return getQuery(criteriaQuery.select(root)).getResultList();
    }

    public T create(T entity) {
        this.getEntityManager().persist(entity);
        return entity;
    }

    public T update(T entity) {
        return this.getEntityManager().merge(entity);
    }

    public T delete(T entity) {
        this.getEntityManager().remove(entity);
        return entity;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    @NotNull
    protected CriteriaBuilder getCriteriaBuilder() {
        return this.getEntityManager().getCriteriaBuilder();
    }

    @NotNull
    protected CriteriaQuery<T> getCriteriaQuery() {
        return (CriteriaQuery<T>) this.getEntityManager().getCriteriaBuilder().createQuery(entity.getClass());
    }

    @NotNull
    protected TypedQuery<T> getQuery(@NotNull CriteriaQuery<T> criteriaQuery) {
        return (this.getEntityManager().createQuery(criteriaQuery));
    }
}
