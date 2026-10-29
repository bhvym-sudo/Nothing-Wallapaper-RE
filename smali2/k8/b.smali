.class public final synthetic Lk8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:[Lv8/l;


# direct methods
.method public synthetic constructor <init>([Lv8/l;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/b;->a:[Lv8/l;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    iget-object p0, p0, Lk8/b;->a:[Lv8/l;

    invoke-static {p0, p1, p2}, Lk8/c;->a([Lv8/l;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method
