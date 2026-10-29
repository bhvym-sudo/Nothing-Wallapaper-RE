.class public final synthetic LD6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LD6/t;


# direct methods
.method public synthetic constructor <init>(LD6/t;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/r;->q:LD6/t;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LD6/r;->q:LD6/t;

    invoke-static {p0}, LD6/t;->a(LD6/t;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method
