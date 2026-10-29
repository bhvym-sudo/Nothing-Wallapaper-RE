.class public final synthetic LS6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/creative/a;

.field public final synthetic r:Le3/o;

.field public final synthetic s:F


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/creative/a;Le3/o;F)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS6/b;->q:Lcom/nothing/wallpaper/picker/creative/a;

    iput-object p2, p0, LS6/b;->r:Le3/o;

    iput p3, p0, LS6/b;->s:F

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, LS6/b;->q:Lcom/nothing/wallpaper/picker/creative/a;

    iget-object v1, p0, LS6/b;->r:Le3/o;

    iget p0, p0, LS6/b;->s:F

    invoke-static {v0, v1, p0}, Lcom/nothing/wallpaper/picker/creative/a;->e0(Lcom/nothing/wallpaper/picker/creative/a;Le3/o;F)V

    return-void
.end method
