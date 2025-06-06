package Katsu.Katsu_spring.service;

import Katsu.Katsu_spring.dto.BoardDTO;
import Katsu.Katsu_spring.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }

    public List<BoardDTO> findAll(){
        return boardRepository.findAll();
    }

    public void updateView(Long postId){
        boardRepository.updateView(postId);
    }

    public BoardDTO findById(Long postId){
        return boardRepository.findById(postId);
    }

    public void update(BoardDTO boardDTO){
        boardRepository.update(boardDTO);
    }

    public void delete(long postId){
        boardRepository.delete(postId);
    }
}
