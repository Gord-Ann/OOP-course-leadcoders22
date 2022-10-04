public class Boxing {
        private String material;
        private int size;
        private int lifetime;

        public Boxing(String material, int size, int lifetime) {
            this.material=material;
            this.size=size;
            this.lifetime=lifetime;
        }

        public String getMaterial() { return this.material;}
        public void setMaterial(String material) {
            this.material=material;
        }
        public int getSize() { return this.size;}
        public void setSize(int size) {
            this.size=size;
        }
        public int getLifetime() { return this.lifetime;}
        public void setLifetime(int lifetime) {
            this.lifetime=lifetime;}
}
