package pe.abovo.simple_sample.simplesample.service;

import org.springframework.stereotype.Service;
import pe.abovo.simple_sample.simplesample.domain.Multiplication;

public interface MultiplicationService {

    Multiplication createRandomMultiplication();
}
