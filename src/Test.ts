namespace Test {
  enum ENUM {
    ABC = "ABC"
  }
  /**
   * 素晴らしいAbc
   */
  interface Abc {
    /**
     * あ
     */
    a: string;
    /**
     * べ
     */
    b: number;
    /**
     * し
     */
    c: Def;
  }

  interface Def {
    d: [string];
    e: [number];
  }
}
export default Test;
