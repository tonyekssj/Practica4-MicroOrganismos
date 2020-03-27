package org.programa;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.programa.MicroOrganismoTes;


import static org.junit.Assert.*;


public class MicroOrganismosTest {
    private int vidaMax=500;
    private MicroOrganismoTes micro=new MicroOrganismoTes("MicroDePrueba",vidaMax);

    @RepeatedTest(10)
    void TestBajarVida()
    {
        micro.IrLugar("higado");
        assertTrue(micro.EstaVivo());
    }

    @Test
    public void TestIrOrgano()
    {
        int vida=micro.Getvida();
        micro.IrLugar("boca");
        assertFalse(micro.Getvida()<vida);
    }



}