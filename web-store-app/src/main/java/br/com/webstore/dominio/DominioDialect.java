package br.com.webstore.dominio;

public enum DominioDialect {

	MYSQL("org.hibernate.dialect.MySQL5Dialect"),
	POSTGRESQL("org.hibernate.dialect.PostgreSQLDialect"),
	MSSQL("");
	
	private String dialect;

	private DominioDialect(String dialect) {
		this.dialect = dialect;
	}

	public String getDialect() {
		return dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}
	
}
