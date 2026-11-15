package com.pixel.sealedclasses.demo;

/**
 * Sealed interface representing API response states.
 *
 * @param <T> The type of data in a successful response
 */
public sealed interface ApiResponse<T>
        permits ApiResponse.Success,
        ApiResponse.Failure,
        ApiResponse.Processing {

    /**
     * Represents a successful API response with data.
     */
    record Success<T>(T data) implements ApiResponse<T> {
        public Success {
            if (data == null) {
                throw new IllegalArgumentException("Data cannot be null in a Success response");
            }
        }

        @Override
        public String toString() {
            return String.format("Success[data=%s]", data);
        }
    }

    /**
     * Represents a failed API response with an exception.
     */
    record Failure(Exception ex) implements ApiResponse<Void> {
        public Failure {
            if (ex == null) {
                throw new IllegalArgumentException("Exception cannot be null in a Failure response");
            }
        }

        @Override
        public String toString() {
            return String.format("Failure[exception=%s]", ex.getMessage());
        }
    }

    /**
     * Represents a processing state for API responses.
     * Singleton implementation.
     */
    final class Processing implements ApiResponse<Void> {
        private static final Processing INSTANCE = new Processing();

        private Processing() {
            // Private constructor to prevent instantiation
        }

        /**
         * Returns the singleton instance of Processing.
         *
         * @return The Processing instance
         */
        public static Processing getInstance() {
            return INSTANCE;
        }

        @Override
        public String toString() {
            return "Processing";
        }

        // Prevent deserialization from creating another instance
        private Object readResolve() {
            return INSTANCE;
        }
    }

    // ============ FACTORY METHODS ============

    /**
     * Creates a successful API response with the provided data.
     *
     * @param data The data to include in the response
     * @param <T> The type of data
     * @return A Success response
     */
    static <T> ApiResponse<T> success(T data) {
        return new Success<>(data);
    }

    /**
     * Creates a failure API response with the provided exception.
     *
     * @param ex The exception that caused the failure
     * @return A Failure response
     */
    static ApiResponse<Void> failure(Exception ex) {
        return new Failure(ex);
    }

    /**
     * Creates a processing API response.
     *
     * @return A Processing response (singleton instance)
     */
    static ApiResponse<Void> processing() {
        return Processing.getInstance();
    }
}