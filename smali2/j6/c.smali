.class public final Lj6/c;
.super Lj6/f$a;
.source "SourceFile"


# instance fields
.field private final q:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .registers 3

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj6/f$a;-><init>()V

    iput-object p1, p0, Lj6/c;->q:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public get()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lj6/c;->q:Landroid/graphics/Bitmap;

    return-object p0
.end method
