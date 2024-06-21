import unittest

# Inserer les méthodes et remplace "XXX" par le nom de la class et 

class TestJUnit(unittest.TestCase):
    def test_RLE(self):
        self.assertEqual(xxx.RLE(""), "")  # Test avec une chaîne vide
        self.assertEqual(xxx.RLE("A"), "1A")  # Test avec une seule lettre
        self.assertEqual(xxx.RLE("AAA"), "3A")  # Test avec une répétition simple
        self.assertEqual(xxx.RLE("AAAAAAAAAA"), "9A1A")  # Test avec une répétition de plus de 9 caractères
        self.assertEqual(xxx.RLE("AAABBB"), "3A3B")  # Test avec des caractères différents
        self.assertEqual(xxx.RLE("AAABBBCCCCCCCCC"), "3A3B9C")  # Test avec une combinaison de cas

    def test_RLER(self):
        self.assertEqual(xxx.RLER("AAABBB", 1), "3A3B")  # Test avec une seule itération
        self.assertEqual(xxx.RLER("AAABBB", 2), "112A112B")  # Test avec deux itérations
        self.assertEqual(xxx.RLER("AAAAAAAAAA", 1), "9A1A")  # Test avec une répétition de plus de 9 caractères
        self.assertEqual(xxx.RLER("AAAAAAAAAA", 2), "17A")  # Test avec deux itérations sur une répétition de plus de 9 caractères

    def test_unRLE(self):
        self.assertEqual(xxx.unRLE(""), "")  # Test avec une chaîne vide
        self.assertEqual(xxx.unRLE("1A"), "A")  # Test avec une seule lettre
        self.assertEqual(xxx.unRLE("3A"), "AAA")  # Test avec une répétition simple
        self.assertEqual(xxx.unRLE("9A1A"), "AAAAAAAAAA")  # Test avec une répétition de plus de 9 caractères
        self.assertEqual(xxx.unRLE("3A3B"), "AAABBB")  # Test avec des caractères différents
        self.assertEqual(xxx.unRLE("9C"), "CCCCCCCCC")  # Test avec une seule répétition de 9 caractères

    def test_unRLER(self):
        self.assertEqual(xxx.unRLER("3A3B", 1), "AAABBB")  # Test avec une seule itération
        self.assertEqual(xxx.unRLER("112A112B", 2), "AAABBB")  # Test avec deux itérations
        self.assertEqual(xxx.unRLER("9A1A", 1), "AAAAAAAAAA")  # Test avec une répétition de plus de 9 caractères
        self.assertEqual(xxx.unRLER("17A", 2), "AAAAAAAAAA")  # Test avec deux itérations sur une répétition de plus de 9 caractères

if __name__ == '__main__':
    unittest.main()