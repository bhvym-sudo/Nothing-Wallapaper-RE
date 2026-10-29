.class public final synthetic Lk6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Landroid/graphics/Bitmap$Config;


# direct methods
.method public synthetic constructor <init>(IILandroid/graphics/Bitmap$Config;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk6/b;->q:I

    iput p2, p0, Lk6/b;->r:I

    iput-object p3, p0, Lk6/b;->s:Landroid/graphics/Bitmap$Config;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget v0, p0, Lk6/b;->q:I

    iget v1, p0, Lk6/b;->r:I

    iget-object p0, p0, Lk6/b;->s:Landroid/graphics/Bitmap$Config;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, v1, p0, p1}, Lk6/c;->o(IILandroid/graphics/Bitmap$Config;Landroid/graphics/Bitmap;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
