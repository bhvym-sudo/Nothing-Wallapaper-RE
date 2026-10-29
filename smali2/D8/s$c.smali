.class public final LD8/s$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/s;->z(LD8/h;Ljava/util/Comparator;)LD8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/h;

.field final synthetic b:Ljava/util/Comparator;


# direct methods
.method constructor <init>(LD8/h;Ljava/util/Comparator;)V
    .registers 3

    iput-object p1, p0, LD8/s$c;->a:LD8/h;

    iput-object p2, p0, LD8/s$c;->b:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 2

    iget-object v0, p0, LD8/s$c;->a:LD8/h;

    invoke-static {v0}, LD8/s;->D(LD8/h;)Ljava/util/List;

    move-result-object v0

    iget-object p0, p0, LD8/s$c;->b:Ljava/util/Comparator;

    invoke-static {v0, p0}, Li8/s;->y(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method
