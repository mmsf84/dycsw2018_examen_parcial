package pregunta5;

public enum StorageType {
    Flash {
        public String toString() {
            return "Flash";
        }
    },

    HardDisk {
        public String toString() {
            return "Hard Disk";
        }
    }
}
