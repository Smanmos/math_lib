public interface Matrix<T> {
    /**
    * Returns the number of rows in the matrix
    */
    public Integer getNumRows();
    public Integer getNumCols();
    public Integer add(Matrix<T> matrix);
    public Integer multiply(Matrix<T> matrix) throws ArithmeticException;
}
