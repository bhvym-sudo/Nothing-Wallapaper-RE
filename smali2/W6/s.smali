.class public final synthetic LW6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LW6/x;

.field public final synthetic r:I

.field public final synthetic s:Landroid/graphics/Point;


# direct methods
.method public synthetic constructor <init>(LW6/x;ILandroid/graphics/Point;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/s;->q:LW6/x;

    iput p2, p0, LW6/s;->r:I

    iput-object p3, p0, LW6/s;->s:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, LW6/s;->q:LW6/x;

    iget v1, p0, LW6/s;->r:I

    iget-object p0, p0, LW6/s;->s:Landroid/graphics/Point;

    invoke-static {v0, v1, p0}, LW6/x;->Y0(LW6/x;ILandroid/graphics/Point;)V

    return-void
.end method
