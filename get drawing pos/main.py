import pygame as g
g.init()

width = 1600
height = 1000

sc = g.display.set_mode((width,height))
fl = True
clock = g.time.Clock()
image = g.image.load('fox.png')
# TODO <a href="https://www.flaticon.com/free-icons/cute" title="cute icons">Cute icons created by Merchadew - Flaticon</a>
body = []
FPS = 60
while fl:
    for event in g.event.get():
        if event.type == g.QUIT or event.type == g.KEYDOWN and event.key == g.K_ESCAPE:
            fl = False
        if event.type == g.MOUSEBUTTONDOWN:
            if event.button == g.BUTTON_LEFT:
                body.append(g.mouse.get_pos())
            if event.button == g.BUTTON_RIGHT:
                print(image.get_at(g.mouse.get_pos()))
    sc.fill((255,255,255))
    sc.blit(image,(0,0))
    g.display.update()
    clock.tick(FPS)
print(body)
exit()