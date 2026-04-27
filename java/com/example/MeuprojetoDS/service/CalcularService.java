package com.example.MeuprojetoDS.service;

import com.example.MeuprojetoDS.model.Parede;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CalcularService {
    /**
     * Calcular o volume de concreto para as vigas
     * @param paredes lista de paredes (arestas do grafo)
     * @param alturaViga altura que o usuãrio informa
     * @return Volume total em m3
     */
//calculo de concreto
    public double calcularVolumeConcreto(List<Parede> paredes, double alturaViga) {
        double volumeTotal=0;
        for (Parede parede: paredes) {
            volumeTotal+=parede.getLargura()*alturaViga*parede.getComprimento();
        }
        return volumeTotal;
    }

//calculo de quantidade de tijolos
public double calcularQuantidadeTijolos (List<Parede> paredes, double alturaTijolo, double larguraTijolo) {
    double areaTotalLiquida=0;
    double areaUmTijolo=alturaTijolo * larguraTijolo;

    for (Parede parede: paredes) {
        //calcular a area da parede total
        double areaParede= parede.getComprimento()*parede.getAltura();

        //subtrai o valor com o valor das portas e das janelas
        if (parede.isTemPorta()) {
            areaParede-=(parede.getAlturaPorta()*parede.getComprimentoPorta());
        }
        if (parede.isTemJanela()) {
            areaParede-=(parede.getAlturaJanela()*parede.getComprimentoJanela());
        }
        areaTotalLiquida+=areaParede;
    }
    return areaTotalLiquida /areaUmTijolo;
    }
}
