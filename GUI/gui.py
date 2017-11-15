import wx

class MyPanel(wx.Panel):
    """ class MyPanel creates a panel to draw on, inherits wx.Panel """
    def __init__(self, parent, id, xcoord, ycoord, length, width):
        # create a panel
        wx.Panel.__init__(self, parent, id)
        self.SetBackgroundColour("white")
        self.Bind(wx.EVT_PAINT, self.OnPaint)
        self.xcoord = xcoord
	self.ycoord = ycoord
	self.length = length
	self.width = width

    def OnPaint(self, evt):
        """set up the device context (DC) for painting"""
        self.dc = wx.PaintDC(self)
        self.dc.BeginDrawing()
        self.dc.SetPen(wx.Pen("hot pink",style=wx.TRANSPARENT))
        self.dc.SetBrush(wx.Brush("hot pink", wx.SOLID))
        # set x, y, w, h for rectangle
        self.dc.DrawRectangle(self.xcoord, self.ycoord, self.width, self.length)
        self.dc.EndDrawing()
        del self.dc

app = wx.PySimpleApp()
# create a window/frame, no parent, -1 is default ID
frame = wx.Frame(None, -1, "Drawing A Rectangle...", size = (500, 500))
# call the derived class, -1 is default ID
MyPanel(frame,-1, 0, 0, 50, 450)
#MyPanel(frame,0, 350, 25, 50, 450)
# show the frame
frame.Show(True)
# start the event loop
app.MainLoop()
