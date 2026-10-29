.class public final synthetic Lcom/nothing/launcher/card/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB2/a;


# instance fields
.field public final synthetic b:Landroid/graphics/drawable/Drawable;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/Drawable;IIF)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/launcher/card/i;->b:Landroid/graphics/drawable/Drawable;

    iput p2, p0, Lcom/nothing/launcher/card/i;->c:I

    iput p3, p0, Lcom/nothing/launcher/card/i;->d:I

    iput p4, p0, Lcom/nothing/launcher/card/i;->e:F

    return-void
.end method


# virtual methods
.method public final b(Landroid/graphics/Canvas;)V
    .registers 5

    iget-object v0, p0, Lcom/nothing/launcher/card/i;->b:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lcom/nothing/launcher/card/i;->c:I

    iget v2, p0, Lcom/nothing/launcher/card/i;->d:I

    iget p0, p0, Lcom/nothing/launcher/card/i;->e:F

    invoke-static {v0, v1, v2, p0, p1}, Lcom/nothing/launcher/card/j;->n0(Landroid/graphics/drawable/Drawable;IIFLandroid/graphics/Canvas;)V

    return-void
.end method
