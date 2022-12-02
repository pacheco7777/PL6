import org.example.UCEx3;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class UCTest {
    static UCEx3 UC;
    @BeforeAll
    public static void setUp(){
        UC = new UCEx3("QS",5);
        UC.insereNotaUc(1,12);
        UC.insereNotaUc(2,14);
    }
    @ParameterizedTest
    @CsvSource(value={"1,12","2,14"})
    public void testInsereNota(int numAluno,double nota){
        assertTrue(UC.insereNotaUc(numAluno,nota));
        //assertFalse(UC.getNotas().isEmpty());
    }

    @ParameterizedTest
    @CsvSource(value = {"1,12","2,14"})
    public void testProcuraAluno(int numAluno,double nota){
        assertEquals(nota,UC.pesquisaAluno(numAluno),"falha na procura");
    }
    @Test
    public void media(){
        assertEquals(13,UC.media(),"falha no calculo da media");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2})
    public void testAprova(int numAluno){
        boolean resultado = UC.aprovado(numAluno);
        assertTrue(resultado,"falha na verificação de aprovação do aluno");
    }
}
