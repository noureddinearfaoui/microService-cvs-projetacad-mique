package com.microServiceCvs.microServiceCvs;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "cvs", type = "cv")
public class Cv {
	  @Id
	    private String id;
	    private String contenuCv;
	    private String idcandidat;
		public Cv() {
			
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getContenuCv() {
			return contenuCv;
		}
		public void setContenuCv(String contenuCv) {
			this.contenuCv = contenuCv;
		}
		public String getIdcandidat() {
			return idcandidat;
		}
		public void setIdcandidat(String idcandidat) {
			this.idcandidat = idcandidat;
		}
		
	    

}
