public class MotaTrouver {

        public static void main(String[] args) {


            String Mot,Prop,MotRep,MotBis;
            int Essai,L,Coup,LBis,Compte,I;


            Mot = Saisie.lire_String("Quel est le mot à trouver ?" );
            L= Mot.length();



            Essai=L-2;
            Coup=0;
            MotBis=" ";


            Prop = Saisie.lire_String("Saisissez votre proposition ou SOL pour avoir la solution" );
            LBis=Prop.length();



            while((Prop.equals ("SOL")==false)&&(LBis!=L))
            {
                Prop = Saisie.lire_String("erreur de saisie,recommencez" );
                LBis=Prop.length();

            }



            while( (Prop.equals (Mot)==false)&&(Prop.equals ("SOL")==false)&&(Coup<=Essai))
            {
                Compte=0;

                for (I=0;I<LBis;I++)
                {
                    if (Mot.substring(I,I+1).equals(Prop.substring(I,I+1))	)
                    {
                        Compte++;
                        MotBis=	MotBis+Mot.substring(I,I+1);
                    }
                    else{MotBis=MotBis+"-";}

                }


                System.out.println("Vous avez "+ Compte +" lettre communes et bien placées");
                System.out.println("Voici les lettres "+ MotBis);
                Coup++;


                if ((Coup<Essai)&&(Prop.equals ("SOL")==false))
                {
                    Prop = Saisie.lire_String("Saisissez votre proposition ou SOL pour avoir la solution" );
                    LBis=Prop.length();
                    while ((Prop.equals ("SOL")==false)&&(LBis!=L))
                    {
                        Prop = Saisie.lire_String("erreur de saisie,recommencez" );
                        LBis= Prop.length();
                    }
                }

            }


            if ((Prop.equals ("SOL")==true))
            {
                System.out.print("Le mot a trouver etait "+Mot);

            }
            else if(Coup>Essai)
            {
                System.out.print("C'est perdu");
            }
            else{
                System.out.println("C'est gagné !");
            }

        }

    }

}
