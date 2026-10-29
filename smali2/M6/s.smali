.class public final synthetic LM6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LM6/u;


# direct methods
.method public synthetic constructor <init>(LM6/u;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/s;->q:LM6/u;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LM6/s;->q:LM6/u;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {p0, p1}, LM6/u;->f(LM6/u;Landroid/graphics/Bitmap;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
