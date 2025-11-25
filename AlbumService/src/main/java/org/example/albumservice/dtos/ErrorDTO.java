package org.example.albumservice.dtos;

/**
 * ErrorDTO
 */
public class ErrorDTO {

    private String error;
    private String message;

    public ErrorDTO() {
    }

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
