public class Pilhas {

        private int tamanhoMaximo;
        private Aluno[] elementos;
        private int topo;
    
        public Pilhas(int tamanhoMaximo) {
            this.tamanhoMaximo = tamanhoMaximo;
            this.elementos = new Aluno[tamanhoMaximo];
            this.topo = -1;
        }
    
        public void init() {
            topo = -1;
        }
    
        public void push(Aluno aluno) {
            if (!isFull()) {
                topo++;
                elementos[topo] = aluno;
            } else {
                System.out.println("Pilha cheia");
            }
        }
    
        public Aluno pop() {
            if (!isEmpty()) {
                Aluno elementoRemovido = elementos[topo];
                topo--;
                return elementoRemovido;
            } else {
                System.out.println("Pilha vazia");
                return null;
            }
        }
    
        public Aluno topo() {
            if (!isEmpty()) {
                return elementos[topo];
            } else {
                System.out.println("Pilha vazia");
                return null;
            }
        }
    
        public boolean isEmpty() {
            return topo == -1;
        }
    
        public boolean isFull() {
            return topo == tamanhoMaximo - 1;
        }
    
        public void destroy() {
            topo = -1;
        }
    }
    
    

