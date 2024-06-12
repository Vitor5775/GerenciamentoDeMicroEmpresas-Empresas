public class AliquotaEfetiva extends Perfil {
    public double obtDeterminado(int perfil, float receitaBrutaTotal) {
        try {
            switch (perfil) {
                case 1:
                    if (receitaBrutaTotal >= 0 && receitaBrutaTotal <= 180000) {
                        determinado = 0.04;
                    } else if (receitaBrutaTotal > 180000 && receitaBrutaTotal <= 360000) {
                        determinado = 0.073;
                    } else if (receitaBrutaTotal > 360000 && receitaBrutaTotal <= 720000) {
                        determinado = 0.095;
                    } else if (receitaBrutaTotal > 720000 && receitaBrutaTotal <= 1800000) {
                        determinado = 0.107;
                    } else if (receitaBrutaTotal > 1800000 && receitaBrutaTotal <= 3600000) {
                        determinado = 0.143;
                    } else if (receitaBrutaTotal > 3600000 && receitaBrutaTotal <= 4800000) {
                        determinado = 0.19;
                    }
                    break;
                case 2:
                    if (receitaBrutaTotal >= 0 && receitaBrutaTotal <= 180000) {
                        determinado = 0.045;
                    } else if (receitaBrutaTotal > 180000 && receitaBrutaTotal <= 360000) {
                        determinado = 0.078;
                    } else if (receitaBrutaTotal > 360000 && receitaBrutaTotal <= 720000) {
                        determinado = 0.10;
                    } else if (receitaBrutaTotal > 720000 && receitaBrutaTotal <= 1800000) {
                        determinado = 0.112;
                    } else if (receitaBrutaTotal > 1800000 && receitaBrutaTotal <= 3600000) {
                        determinado = 0.147;
                    } else if (receitaBrutaTotal > 3600000 && receitaBrutaTotal <= 4800000) {
                        determinado = 0.30;
                    }
                    break;
                case 3:
                    if (receitaBrutaTotal >= 0 && receitaBrutaTotal <= 180000) {
                        determinado = 0.06;
                    } else if (receitaBrutaTotal > 180000 && receitaBrutaTotal <= 360000) {
                        determinado = 0.112;
                    } else if (receitaBrutaTotal > 360000 && receitaBrutaTotal <= 720000) {
                        determinado = 0.135;
                    } else if (receitaBrutaTotal > 720000 && receitaBrutaTotal <= 1800000) {
                        determinado = 0.16;
                    } else if (receitaBrutaTotal > 1800000 && receitaBrutaTotal <= 3600000) {
                        determinado = 0.21;
                    } else if (receitaBrutaTotal > 3600000 && receitaBrutaTotal <= 4800000) {
                        determinado = 0.33;
                    }
                    break;
                case 4:
                    if (receitaBrutaTotal >= 0 && receitaBrutaTotal <= 180000) {
                        determinado = 0.045;
                    } else if (receitaBrutaTotal > 180000 && receitaBrutaTotal <= 360000) {
                        determinado = 0.09;
                    } else if (receitaBrutaTotal > 360000 && receitaBrutaTotal <= 720000) {
                        determinado = 0.102;
                    } else if (receitaBrutaTotal > 720000 && receitaBrutaTotal <= 1800000) {
                        determinado = 0.14;
                    } else if (receitaBrutaTotal > 1800000 && receitaBrutaTotal <= 3600000) {
                        determinado = 0.22;
                    } else if (receitaBrutaTotal > 3600000 && receitaBrutaTotal <= 4800000) {
                        determinado = 0.33;
                    }
                    break;
                case 5:
                    if (receitaBrutaTotal >= 0 && receitaBrutaTotal <= 180000) {
                        determinado = 0.155;
                    } else if (receitaBrutaTotal > 180000 && receitaBrutaTotal <= 360000) {
                        determinado = 0.18;
                    } else if (receitaBrutaTotal > 360000 && receitaBrutaTotal <= 720000) {
                        determinado = 0.195;
                    } else if (receitaBrutaTotal > 720000 && receitaBrutaTotal <= 1800000) {
                        determinado = 0.205;
                    } else if (receitaBrutaTotal > 1800000 && receitaBrutaTotal <= 3600000) {
                        determinado = 0.23;
                    } else if (receitaBrutaTotal > 3600000 && receitaBrutaTotal <= 4800000) {
                        determinado = 0.305;
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro ao determinar alíquota: " + e.toString());
        }
        return determinado;
    }
}