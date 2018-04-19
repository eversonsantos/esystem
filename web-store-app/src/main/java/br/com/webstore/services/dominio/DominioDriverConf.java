package br.com.webstore.services.dominio;

public enum DominioDriverConf {
	
	MYSQL("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/", "root", "admin"),
	POSTGRESQL("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/", "postgres", "admin"),
	MSSQL("", "", "", "");

	private String driver;
	private String url;
	private String login;
	private String password;
	
	private DominioDriverConf(String driver, String url, String login,
			String password) {
		this.driver = driver;
		this.url = url;
		this.login = login;
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
