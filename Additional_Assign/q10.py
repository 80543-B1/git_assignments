class Painting:
    def calculatePaintingCost(self):
        pass
class FlatPainting(Painting):
    def __init__(self,no_rooms):
        self.no_rooms = no_rooms

    def calculatePaintingCost(self):
        return self.no_rooms * 10000

class BuildingPaintCost(Painting):
    def __init__(self,no_flats):
        self.no_flats = no_flats

    def calculateBuildingCost(self):
        return self.no_flats * 25000

flat = FlatPainting(3)
print(flat.calculatePaintingCost())

room = BuildingPaintCost(5)
print(room.calculateBuildingCost())
