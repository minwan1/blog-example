package collection.list.vector;


//array list와 동일하나 동기화를 지원한다.


import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        list.remove(2);
        list.remove(3);

        for(int i = 0; i<list.size(); i++){
            final Board board = list.get(i);
            System.out.println(board.subject + "\t" +board.content + "\t" + board.writer);
//            제목1	내용1	글쓴이1
//            제목2	내용2	글쓴이2
//            제목4	내용4	글쓴이4
        }

    }

    public static class Board{
        private String subject;
        private String content;
        private String writer;

        public Board(String subject, String content, String writer) {
            this.subject = subject;
            this.content = content;
            this.writer = writer;
        }
    }

}