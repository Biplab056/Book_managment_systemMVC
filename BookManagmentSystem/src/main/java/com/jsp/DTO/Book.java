package com.jsp.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
		
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private int id;
		private String book_name;
		private String authur;
		private String publication_date;
		private String description;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBook_name() {
			return book_name;
		}
		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}
		public String getAuthur() {
			return authur;
		}
		public void setAuthur(String authur) {
			this.authur = authur;
		}
		public String getPublication_date() {
			return publication_date;
		}
		public void setPublication_date(String publication_date) {
			this.publication_date = publication_date;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
}
