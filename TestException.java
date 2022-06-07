package Lesson11;

class TestException extends Exception {

    @Override
    public String getMessage() {
        return "переопределили метод сообщение";
    }

    @Override
    public String toString() {
        return "I don/t know переопределили сообщение об ошибке";
    }
}
