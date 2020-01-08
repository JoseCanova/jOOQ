/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.db.h2;


import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.db.h2.tables.Author;
import org.jooq.example.db.h2.tables.Book;
import org.jooq.example.db.h2.tables.BookStore;
import org.jooq.example.db.h2.tables.BookToBookStore;
import org.jooq.example.db.h2.tables.records.AuthorRecord;
import org.jooq.example.db.h2.tables.records.BookRecord;
import org.jooq.example.db.h2.tables.records.BookStoreRecord;
import org.jooq.example.db.h2.tables.records.BookToBookStoreRecord;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of
 * the <code>PUBLIC</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AuthorRecord, Integer> IDENTITY_AUTHOR = Identities0.IDENTITY_AUTHOR;
    public static final Identity<BookRecord, Integer> IDENTITY_BOOK = Identities0.IDENTITY_BOOK;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
    public static final UniqueKey<BookRecord> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;
    public static final UniqueKey<BookStoreRecord> UK_T_BOOK_STORE_NAME = UniqueKeys0.UK_T_BOOK_STORE_NAME;
    public static final UniqueKey<BookToBookStoreRecord> PK_B2BS = UniqueKeys0.PK_B2BS;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_AUTHOR_ID;
    public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_CO_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_CO_AUTHOR_ID;
    public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BS_NAME = ForeignKeys0.FK_B2BS_BS_NAME;
    public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_B_ID = ForeignKeys0.FK_B2BS_B_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AuthorRecord, Integer> IDENTITY_AUTHOR = Internal.createIdentity(Author.AUTHOR, Author.AUTHOR.ID);
        public static Identity<BookRecord, Integer> IDENTITY_BOOK = Internal.createIdentity(Book.BOOK, Book.BOOK.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorRecord> PK_T_AUTHOR = Internal.createUniqueKey(Author.AUTHOR, "PK_T_AUTHOR", new TableField[] { Author.AUTHOR.ID }, true);
        public static final UniqueKey<BookRecord> PK_T_BOOK = Internal.createUniqueKey(Book.BOOK, "PK_T_BOOK", new TableField[] { Book.BOOK.ID }, true);
        public static final UniqueKey<BookStoreRecord> UK_T_BOOK_STORE_NAME = Internal.createUniqueKey(BookStore.BOOK_STORE, "UK_T_BOOK_STORE_NAME", new TableField[] { BookStore.BOOK_STORE.NAME }, true);
        public static final UniqueKey<BookToBookStoreRecord> PK_B2BS = Internal.createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, "PK_B2BS", new TableField[] { BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_AUTHOR_ID = Internal.createForeignKey(Keys.PK_T_AUTHOR, Book.BOOK, "FK_T_BOOK_AUTHOR_ID", new TableField[] { Book.BOOK.AUTHOR_ID }, true);
        public static final ForeignKey<BookRecord, AuthorRecord> FK_T_BOOK_CO_AUTHOR_ID = Internal.createForeignKey(Keys.PK_T_AUTHOR, Book.BOOK, "FK_T_BOOK_CO_AUTHOR_ID", new TableField[] { Book.BOOK.CO_AUTHOR_ID }, true);
        public static final ForeignKey<BookToBookStoreRecord, BookStoreRecord> FK_B2BS_BS_NAME = Internal.createForeignKey(Keys.UK_T_BOOK_STORE_NAME, BookToBookStore.BOOK_TO_BOOK_STORE, "FK_B2BS_BS_NAME", new TableField[] { BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME }, true);
        public static final ForeignKey<BookToBookStoreRecord, BookRecord> FK_B2BS_B_ID = Internal.createForeignKey(Keys.PK_T_BOOK, BookToBookStore.BOOK_TO_BOOK_STORE, "FK_B2BS_B_ID", new TableField[] { BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID }, true);
    }
}
