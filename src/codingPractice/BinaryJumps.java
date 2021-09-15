package codingPractice;

public class BinaryJumps {

    public static void main (String[] args) {

        String game = "10101111100010010011101001010010101000001111111001110000010111101010010011001011101110011011010000000101110110111101111100000110101010101010110000000111000000100100100110111101100001010001001100111001000100101100100011000000111110011110100100001010101011001001111110101010101000001110101111011000101111001110001110011110111000111100001001011110000011011100001110001011110100100010100110101111100101000000001100001001000100101111100100011111000010011001100011110010110010010100001111101001001001101000110010111010010111101100000010000101011000110010111001110111001100110001011100111100101111100001111001011101001000011011000111011010111110000000110001011001010110110101111000010101100111001100010001001001011001010110001001110010100011010101111000011010111011110001110111100001110111110001011011001100010100000110000110001000011000110101011110111011101010110111010101000101000101000011100100011100111110010011010011110000110110000001001001010110011001000011100100111100011101011000100000000011111000011010001001100111011100011";
        int result = 1; // 이동 수는 최소 1

        char lastTile = game.charAt(game.length() - 1); // 마지막 타일 가져오기

        int current = result; // 현재 이동수
        for(int i=0; i<game.length(); i++) {
            if (game.charAt(i) != lastTile) { // 현재 타일이 점프해야할 타일이라면
                current++;                    // 현재 최소 점프수 증가
            } else {                          // 현재 타일이 이동할 수 있는 타일이라면 현재 최소 점프수를 확인
                if (current > result) {       // 현재 최소 점프수가 최종 최소 점프수보다 크다면
                    result = current;         // 최종 최소 점프수 변경
                }
                current = 1;                  // 현재 최소 점프수 초기화
            }
        }

        System.out.println(result);
    }

}