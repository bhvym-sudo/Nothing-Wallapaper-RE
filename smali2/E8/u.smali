.class public final synthetic LE8/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE8/u;->q:Ljava/util/List;

    iput-boolean p2, p0, LE8/u;->r:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, LE8/u;->q:Ljava/util/List;

    iget-boolean p0, p0, LE8/u;->r:Z

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p0, p1, p2}, LE8/w;->N(Ljava/util/List;ZLjava/lang/CharSequence;I)Lh8/o;

    move-result-object p0

    return-object p0
.end method
