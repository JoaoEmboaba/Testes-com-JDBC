package db;

public class DbException extends RuntimeException {

	private long serialVersionUID = 1L;

	public DbException(String msg) {
		super(msg);
	}
}
