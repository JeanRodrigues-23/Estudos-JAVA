package adopet.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PetAdotadoException.class)
    public ResponseEntity<ResponseError> petAdotadoException(PetAdotadoException e) {

        ResponseError responseError = new ResponseError(e.getMessage(), HttpStatus.BAD_REQUEST, LocalDateTime.now());

        return ResponseEntity.badRequest().body(responseError);
    }

    @ExceptionHandler(LimiteAdocoesException.class)
    public ResponseEntity<ResponseError> limiteAdocoesException(PetAdotadoException e) {

        ResponseError responseError = new ResponseError(e.getMessage(), HttpStatus.BAD_REQUEST, LocalDateTime.now());

        return ResponseEntity.badRequest().body(responseError);
    }

    @ExceptionHandler(AdocaoEmAndamentoException.class)
    public ResponseEntity<ResponseError> adocaoEmAndamentoException(AdocaoEmAndamentoException e) {

        ResponseError responseError = new ResponseError(e.getMessage(), HttpStatus.BAD_REQUEST, LocalDateTime.now());

        return ResponseEntity.badRequest().body(responseError);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseError> trataException(Exception e) {

        ResponseError responseError = new ResponseError(e.getMessage(), HttpStatus.BAD_REQUEST, LocalDateTime.now());

        return ResponseEntity.badRequest().body(responseError);
    }
}
